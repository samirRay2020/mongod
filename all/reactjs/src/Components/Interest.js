import { Outlet, Link } from "react-router-dom";
import React from 'react'
import pic1 from './images/books.jpg';
import pic2 from './images/code.jpg';
import pic3 from './images/cric.jpg';

export default function Interest(){
    return (
        <div style={{backgroundColor:"powderblue",height:"85vh",padding:"10px"}}>
            <center>
                <h1>Areas of Interest</h1>
            </center>
            <img src={pic1} height="150" width="100" style={{float:"left", width:"31%", marginRight:"2%"}} />
            <img src={pic2} height="150" width="100" style={{float:"left", width:"31%", marginRight:"2%"}} />
            <img src={pic3} height="150" width="100" style={{float:"left", width:"31%", marginRight:"2%"}} />
            <p style={{clear:"both"}}></p><br></br><br/>
            <center>
            <div style={{width:"40%",border:"1px solid red",textAlign:"center"}}>
                <ol>
                    <li>Coding</li>
                    <li>Reading Novels</li>
                    <li>Playing Football</li>
                    <li>Playing cricket</li>
                    <li>Listening to Music</li>

                </ol>
            </div>
            </center>
        </div>
    )
}