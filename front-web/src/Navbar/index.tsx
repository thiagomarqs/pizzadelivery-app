import React from 'react';
import "./styles.css";
import { ReactComponent as Logo } from "./logo.svg";
import { Link } from 'react-router-dom';

function Navbar(){
    return(
        <nav className="main-navbar">
            <Logo/>
            <Link to="/" className="logo-text">Pizza Delivery</Link>
        </nav>
    )
}

// Necessary for other components to be able to use this one
export default Navbar