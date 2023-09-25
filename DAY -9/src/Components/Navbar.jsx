// import { useRef } from "react";
// import { FaBars, FaTimes } from "react-icons/fa";
// import "../Styles/Navbar.css";
// import { useHistory } from "react-router-dom/cjs/react-router-dom.min";


// function Navbar() {
// 	const navRef = useRef();

// 	const showNavbar = () => {
// 		navRef.current.classList.toggle(
// 			"responsive_nav"
// 		);
// 	};

// 	let history = useHistory()
// 	return (
// 		<header>
// 			<h3></h3>
// 			<nav ref={navRef}>
// 				<a href="/#">Home</a>
// 				<a href="/Dashboard">Dashboard</a>
// 				<a href="/#">Portfolio</a>
// 				<a href="/#">About me</a>
// 				<button
// 					className="nav-btn nav-close-btn"
// 					onClick={showNavbar}>
// 					<FaTimes />
// 				</button>
// 			</nav>
// 			<button
// 				className="nav-btn"
// 				onClick={showNavbar}>
// 				<FaBars />
// 			</button>
// 		</header>
// 	);
// }

// export default Navbar;