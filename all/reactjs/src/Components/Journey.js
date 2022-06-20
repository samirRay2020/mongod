import { Outlet, Link } from "react-router-dom";
import React from 'react'
import pic1 from './images/elem.jpg';
import pic2 from './images/vg.jpg';
import pic3 from './images/ssn.png';

export default function Journey(){
    return (
        <div style={{backgroundColor:"powderblue",height:"85vh",padding:"10px"}}>
            <center>
                <h1>My Jouney to SSN</h1><br/><br/><br/>
                <img src={pic1} height="150" width="100" style={{float:"left", width:"31%", marginRight:"2%"}} />
                <img src={pic2} height="150" width="100" style={{float:"left", width:"31%", marginRight:"2%"}} />
                <img src={pic3} height="150" width="100" style={{float:"left", width:"31%", marginRight:"2%"}} />
                <p style={{clear:"both"}}></p><br></br>
                <hr />
                <p style={{color:"red"}}> Velit volutpat tristique penatibus cum natoque lorem arcu mollis volutpat placerat morbi. Tortor tortor netus vivamus montes mus scelerisque velit augue vulputate montes ligula mattis. 
                    Facilisi rutrum in euismod ultricies duis, tincidunt porttitor. Integer dapibus, hendrerit sociosqu curabitur gravida placerat nec cras tellus mus euismod. Torquent parturient, 
                    conubia luctus duis sodales condimentum vestibulum felis ac laoreet natoque. Curabitur cursus sociis suspendisse ridiculus netus sociis lobortis elementum nisi facilisi metus. 
                    Amet vel vehicula dignissim velit morbi lacus potenti nisi vitae. Condimentum adipiscing vulputate curabitur cum odio tortor dignissim mattis faucibus fusce etiam ante.
                </p>
            </center>
        </div>
    )
}