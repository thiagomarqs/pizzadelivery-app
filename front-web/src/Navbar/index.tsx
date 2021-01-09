import React from 'react';
import "./styles.css";
import { ReactComponent as Logo } from "./logo.svg";

function Navbar(){
    return(
        <nav className="main-navbar">
            <Logo/>
            <a href="home" className="logo-text">Pizza Delivery</a>
        </nav>
    )
}

// Necessary for other components to be able to use this one
export default Navbar