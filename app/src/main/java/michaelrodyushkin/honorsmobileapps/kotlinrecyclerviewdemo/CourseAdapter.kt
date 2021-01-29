package michaelrodyushkin.honorsmobileapps.kotlinrecyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(val courseList: List<Course>) : RecyclerView.Adapter<CourseViewHolder>() {
    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val currentCourse = courseList[position]
        holder.bindCourse(currentCourse)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val rootView  = layoutInflater.inflate(R.layout.list_item_layout, parent, false)
        val newViewHolder = CourseViewHolder(rootView)
        return newViewHolder
    }
}