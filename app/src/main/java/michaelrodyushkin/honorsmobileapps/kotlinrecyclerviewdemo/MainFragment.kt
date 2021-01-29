package michaelrodyushkin.honorsmobileapps.kotlinrecyclerviewdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_main, container, false)
        val mRecyclerView: RecyclerView = rootView.findViewById(R.id.recyclerView)
        val courses = listOf(Course("Mobile Apps", "Jones", R.drawable.ic_android_black_24dp),
            Course("Apple Scripts", "Kusma", R.drawable.ic_android_black_24dp),
            Course("Crazy-Good UI Design", "DeSeta", R.drawable.ic_android_black_24dp),
            Course("Mastering Chess", "Iyengar", R.drawable.ic_android_black_24dp),
            Course("Advanced LandCandy", "Traweek", R.drawable.ic_android_black_24dp),
            Course("Soccer 101", "Neary", R.drawable.ic_android_black_24dp)
        )
        val mAdapter = CourseAdapter(courses)
        mRecyclerView.adapter = mAdapter
        return rootView
    }
}
