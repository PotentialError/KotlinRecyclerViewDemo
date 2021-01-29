package michaelrodyushkin.honorsmobileapps.kotlinrecyclerviewdemo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {
    private lateinit var currentCourse: Course
    private val courseTitleTextView: TextView = itemView.findViewById(R.id.textViewCourseTitle)
    private val courseInstructorTextView: TextView = itemView.findViewById(R.id.textViewCourseInstructor)
    private val courseImageView: ImageView = itemView.findViewById(R.id.imageViewCourseImage)
    fun bindCourse(course : Course) {
        currentCourse = course
        courseTitleTextView.text = currentCourse.courseTitle
        courseInstructorTextView.text = currentCourse.courseInstructor
        courseImageView.setImageResource(currentCourse.courseImageResourceId)
    }
}