import React, { useState } from "react"
import { Link } from "react-router-dom"
import Head from "./Head"
import "./header.css"
import Home from "../../home/Home"
// import Footer from "./Footer"


const Header = () => {
  const [click, setClick] = useState(false)

  return (
    <>
    <div>
      <Head />
      <Home/>
      <header>
        <nav className='flexSB'>
          <ul className={click ? "mobile-nav" : "flexSB "} onClick={() => setClick(false)}>
            <li>
              <Link to='/Header'>Home</Link>
            </li>
            <li>
              <Link to='/courses'>All Courses</Link>
            </li>
            <li>
              <Link to='/about'>About</Link>
            </li>
            <li>
              <Link to='/Dashboard'>Dashboard</Link>
            </li>
            <li>
              <Link to=''>Signup</Link>
            </li>
            <li>
              <Link to='/login'>Login</Link>
            </li>
            {/* <li>
              <Link to='/team'>Team</Link>
            </li>
            <li>
              <Link to='/pricing'>Pricing</Link>
            </li>
            <li>
              <Link to='/journal'>Journal</Link>
            </li>
            <li>
              <Link to='/contact'>Contact</Link>
            </li> */}
          </ul>
          <div className='start'>
            <div className='button'>GET CERTIFICATE</div>
          </div>
          <button className='toggle' onClick={() => setClick(!click)}>
            {click ? <i className='fa fa-times'> </i> : <i className='fa fa-bars'></i>}
          </button>
        </nav>
      </header>
      </div>
      <div style = {{position:'relative'}}>

      {/* <Footer/> */}
      </div>
    </>
  )
}

export default Header

