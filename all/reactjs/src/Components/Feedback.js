import { Outlet, Link } from "react-router-dom";
import React from 'react'
import pic from './images/acad.jpg';

export default function Feedback(){
    return (
        <div style={{backgroundColor:"powderblue",height:"85vh",padding:"10px"}}>
            <center>
                <h1>Feedback</h1>
                <br/><br/>
                <form action="">
                    Name: <input type="text" id="name" name="name" /><br/><br/><br/>
                    Email: <input type="email" id="mail" name="mail" />
                    <br/><br/>
                    <label for="sat">Were you satisfied with the details?</label><br/><br/>
                    <input type="radio" id="sat" name="sat" value="vs" />Very Satisfied  
                    <input type="radio" id="sat" name="sat" value="ss" />Satisfied  
                    <input type="radio" id="sat" name="sat" value="avg" />Average
                    <input type="radio" id="sat" name="sat" value="ns" />Not Satisfied
                    <br /><br/><br/>
                    <label for="feedback">Suggestions </label><br/>
                    <textarea rows="10" cols="30" name="feedback" id="feedback"></textarea><br/><br/>
                    <input type="submit" value="submit" /><br/><br/>
                </form>
            </center>
        </div>
    )
}