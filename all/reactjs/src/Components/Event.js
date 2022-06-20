import { Outlet, Link } from "react-router-dom";
import React from 'react'
import pic1 from './images/clean1.jpg';
import pic2 from './images/clean2.jpg';
import pic3 from './images/quiz1.jpg';
import pic4 from './images/quiz2.jpg';

export default function Event(){
    return (
        <div style={{backgroundColor:"powderblue",height:"85vh",padding:"10px"}}>
            <center>
                <h1>Events Organised</h1><br/><br/>
                <img src={pic1} height="150" width="100" style={{float:"left", width:"24%", marginRight:"1%"}} />
                <img src={pic2} height="150" width="100" style={{float:"left", width:"25%", marginRight:"2%"}} />
                <div style={{float:"left", width: "45%"}}>
                    <h3 style={{color:"orange"}}>Cleaniness Drive at Village</h3>
                    <p style={{color:"peru"}}>Organised Cleaniness Drive at my village, spreding awareness regarding the importance of clean and hygienic environment. Involved young students as well as the elders of my village to take part in it.</p>
                </div>
                <p style={{clear: "both"}}></p>
                <br></br><br/>
                <div style={{float:"left", width:"45%", marginRight:"2%" }}>
                    <h3 style={{color:"orange"}}>Inter-class Maths Quiz</h3>
                    <p style={{color:"peru"}}>Organised Inter-class maths quiz at VidyaGyan School. Teams of 4 peaople each were formed from each standard and quiz was conducted amond them. There were four rounds in the quiz each with varying difficulty levels and scores. After the ast round the team with maximum points was declared as winner.</p>
                </div>
                <img src={pic3} height="150" width="100" style={{float:"left", width:"24%", marginRight:"1%"}} />
                <img src={pic4} height="150" width="100" style={{float:"left", width:"25%", marginRight:"2%"}} />
                <p style={{clear: "both"}}></p>
                <br></br>
            </center>
        </div>
    )
}