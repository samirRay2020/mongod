import { Outlet, Link } from "react-router-dom";
import pic1 from './images/clean1.jpg';
import pic from './images/acad.jpg';

const Layout = () => {
  return (
    <>
      <nav style={{backgroundColor:"yellow",height:"30px",color:"white",textAlign:"center",marginBottom:"2%"}}>
        <ul style={{display: "flex", justifyContent: "space-between",listStyleType:"none"}}>
          <li>
            <Link to="/">Layout</Link>
          </li>
          <li>
            <Link to="/personal">Personal Info</Link>
          </li>
          <li>
            <Link to="/academic">Academic Information</Link>
          </li>
          <li>
            <Link to="/feedback">Feedback</Link></li>
            <li>
            <Link to="/journey">Journey</Link>
          </li>
          <li>
            <Link to="/events">Event</Link>
          </li>
        </ul> 
      </nav>
      <Outlet />
    </>
  )
};

export default Layout;