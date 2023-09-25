import React from 'react'
import "../Styles/Dashboard.css";
import 
{BsCart3, BsGrid1X2Fill, BsFillArchiveFill, BsFillGrid3X3GapFill, BsPeopleFill, 
  BsListCheck, BsMenuButtonWideFill, BsFillGearFill}
 from 'react-icons/bs'

function Sidebar({openSidebarToggle, OpenSidebar}) {
  return (
    <aside id="sidebar" className={openSidebarToggle ? "sidebar-responsive": ""}>
        <div className='sidebar-title'>
            <div className='sidebar-brand'>
                {/* <BsCart3  className='icon_header'/>  */}CamCraft
            </div>
            <span className='icon close_icon' onClick={OpenSidebar}>X</span>
        </div>

        <ul className='sidebar-list'>
            <li className='sidebar-list-item'>
                <a href="/Dashboard">
                    <BsGrid1X2Fill className='dicon'/> Dashboard
                </a>
            </li>
            <li className='sidebar-list-item'>
                {/* <a href="">
                    <BsFillArchiveFill className='dicon'/> Snapshots
                </a> */}
                <a href="/Header">
                    <BsFillArchiveFill className='dicon'/> Home
                </a>
            </li>
            <li className='sidebar-list-item'>
                {/* <a href="">
                    <BsFillGrid3X3GapFill className='dicon'/> Categories
                </a> */}
                <a href="/courses">
                    <BsFillGrid3X3GapFill className='dicon'/> All courses
                </a>
            </li>
            <li className='sidebar-list-item'>
                {/* <a href="">
                    <BsPeopleFill className='dicon'/> Customers
                </a> */}
                <a href="/about">
                    <BsPeopleFill className='dicon'/> About
                </a>
            </li>
            {/* <li className='sidebar-list-item'>
                <a href="">
                    <BsListCheck className='dicon'/> Photographs
                </a>
            </li>
            <li className='sidebar-list-item'>
                <a href="">
                    <BsMenuButtonWideFill className='dicon'/> Reports
                </a>
            </li>
            <li className='sidebar-list-item'>
                <a href="">
                    <BsFillGearFill className='dicon'/> Setting
                </a>
            </li> */}
        </ul>
    </aside>
  )
}

export default Sidebar