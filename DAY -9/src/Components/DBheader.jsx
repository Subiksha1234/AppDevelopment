import React from 'react'
import "../Styles/Dashboard.css";
import 
 {BsFillBellFill, BsFillEnvelopeFill, BsPersonCircle, BsSearch, BsJustify}
 from 'react-icons/bs'

function DBHeader({OpenSidebar}) {
  return (
    <header className='dheader'>
        <div className='dmenu-icon'>
            <BsJustify className='dicon' onClick={OpenSidebar}/>
        </div>
        <div className='dheader-left'>
            <BsSearch  className='dicon'/>
        </div>
        <div className='dheader-right'>
            <BsFillBellFill className='dicon'/>
            <BsFillEnvelopeFill className='dicon'/>
            <BsPersonCircle className='dicon'/>
        </div>
    </header>
  )
}

export default DBHeader