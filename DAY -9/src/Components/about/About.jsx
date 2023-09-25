import React from "react"
import "./about.css"
import Back from "../common/back/Back"
import AboutCard from "./AboutCard"
import Awrapper from "./AWrapper"
import Heading from "../common/heading/Heading"

const About = () => {
  return (
    <>
      <Heading subtitle='About Us' title='About Our Camcraft Platform' />
      <AboutCard />
    </>
  )
}

export default About
