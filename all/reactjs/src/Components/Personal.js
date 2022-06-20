import { Outlet, Link } from "react-router-dom";
import React from 'react'
import pic from './images/images.jpg';

export default function Personal(){
    return (
        <div style={{backgroundColor:"powderblue",height:"85vh",padding:"10px"}}>
            <center>
                <img src={pic} style={{borderRadius:"50%",width:"250",height:"300",}} />
                <h2 style={{color:"red"}}>Vaibhav Pandey</h2>
                <b><p style={{fontSize:"20px"}}>Hi, I'm 20 years old.</p>
                    <p style={{fontSize:"20px"}}>Currently I'm a student at SSN College of Engineering </p>
                    <p style={{fontSize:"20px"}}>pursuing BE in Computer Science.
                </p></b>
            </center><br /><br /> <br />
            <footer>
                <address>
                    SSN College of Engineering<br />
                    Kalavakkam, Chennai <br />
                    Contact: +91 6696699699<br />
                    Email: <a href="mailto:abhaykumart12@gmail.com">pandeyvaibhav@gmail.com </a><br />
                </address>
            </footer>
        </div>
    )
}

//export default Personal;