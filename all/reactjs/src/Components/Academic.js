import { Outlet, Link } from "react-router-dom";
import React from 'react'
import pic from './images/acad.jpg';

export default function Academic(){
    return (
        <div style={{backgroundColor:"powderblue",height:"85vh",padding:"10px"}}>
            <center>
                <h1>Academic details</h1><br/><br/><br/>
                <img src={pic} style={{borderRadius:"50%",width:"250",height:"300",}} /><br /> <br />
                <table border="1" style={{textAlign:"center",width:"30%", marginRight:"3%",}}>
                    <tr>
                        <th colspan="2">BE Computer Science and Engineering</th>
                    </tr>
                    <tr>
                        <th>College Name</th>
                        <td>SSN College of Engineering</td>
                    </tr>
                    <tr>
                        <th>Duration</th>
                        <td>2019 - Present</td>
                    </tr>
                    <tr>
                        <th>CGPA</th>
                        <td>8.76 CGPA</td>
                    </tr>
                </table>
            </center>
        </div>
    )
}