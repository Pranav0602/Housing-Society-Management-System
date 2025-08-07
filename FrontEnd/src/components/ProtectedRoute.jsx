import { Navigate, Outlet, useLocation } from 'react-router-dom';
import { useEffect, useState } from 'react';
import { useAuth } from '../context/AuthContext';

const ProtectedRoute = ({ allowedRoles }) => {
  const { currentUser, isAuthenticated, hasAllocatedFlat, checkFlatAllocation } = useAuth();
  const [loading, setLoading] = useState(true);
  const [shouldRedirect, setShouldRedirect] = useState(false);
  const [redirectPath, setRedirectPath] = useState('');
  const location = useLocation();

  useEffect(() => {
    const checkAccess = async () => {
      // Check if user is authenticated
      if (!isAuthenticated()) {
        setRedirectPath('/login');
        setShouldRedirect(true);
        setLoading(false);
        return;
      }

      // Check if user has required role
      if (allowedRoles && !allowedRoles.includes(currentUser.role)) {
        // Redirect based on user role
        if (currentUser.role === 'ADMIN') {
          setRedirectPath('/admin/dashboard');
        } else if (currentUser.role === 'RESIDENT') {
          setRedirectPath('/resident/dashboard');
        } else if (currentUser.role === 'GUARD') {
          setRedirectPath('/guard/dashboard');
        } else {
          setRedirectPath('/');
        }
        setShouldRedirect(true);
        setLoading(false);
        return;
      }

      // Special check for residents: if they don't have an allocated flat
      // and they're not already on the allocation request page, redirect them
      if (
        currentUser.role === 'RESIDENT' && 
        location.pathname !== '/resident/request-allocation'
      ) {
        // Check if resident has an allocated flat
        const hasFlat = await checkFlatAllocation();
        if (!hasFlat) {
          setRedirectPath('/resident/request-allocation');
          setShouldRedirect(true);
        }
      }

      setLoading(false);
    };

    checkAccess();
  }, [currentUser, isAuthenticated, allowedRoles, location.pathname]);

  if (loading) {
    return (
      <div className="flex justify-center items-center h-screen">
        <div className="animate-spin rounded-full h-12 w-12 border-t-2 border-b-2 border-blue-500"></div>
      </div>
    );
  }

  if (shouldRedirect) {
    return <Navigate to={redirectPath} replace />;
  }

  // If authenticated and has required role, render the child routes
  return <Outlet />;
};

export default ProtectedRoute;