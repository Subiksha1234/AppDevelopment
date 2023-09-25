
import React from "react"
import Back from "../common/back/Back"
import CoursesCard from "./CourseCard"
import OnlineCourses from "./OnlineCourses"
import Heading from "../common/heading/Heading"

const CourseHome = () => {
  return (
    <>
      {/* <Back title='Explore Courses' /> */}
      <Heading subtitle='COURSES' title='Explore Our Online Courses' />
      <CoursesCard />
      <OnlineCourses />
    </>
  )
}

export default CourseHome