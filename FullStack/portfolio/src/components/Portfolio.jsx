import React from "react";
import { Link } from "react-router-dom";

const Portfolio = () => {
  return (
    <>
      <nav>
        <div className="portfolio">
        <h1>Portfolio</h1>
        </div>
        <div className="navs">
        <Link to="/" className="links">Home</Link><br></br>
        <Link to="/about" className="links">About</Link><br></br>
        <Link to="/project" className="links">Project</Link><br></br>
        <Link to="/contact" className="links">Contact</Link><br></br>
        </div>
      </nav>
    </>
  );
};

export default Portfolio;