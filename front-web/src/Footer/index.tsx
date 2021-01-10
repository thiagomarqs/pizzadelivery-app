import React from 'react';
import "./styles.css";
import { ReactComponent as LinkedInIcon } from './Linkedin.svg';

function Footer(){
    return(
        <footer className="main-footer">
          App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
          <div className="footer-icons">
            <a href="https://linkedin.com/in/thiagosmarques" target="_new">
              <LinkedInIcon />
            </a>
          </div>
        </footer>
    )
}

export default Footer