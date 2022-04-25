package me.bincy.motionlayout.sample

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.BounceInterpolator
import android.widget.ImageView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), MotionLayout.TransitionListener {
    private val motionLayout by lazy {
        findViewById<MotionLayout>(R.id.motionLayout)
    }
    private val favImage by lazy {
        findViewById<ImageView>(R.id.favImage)
    }

    private val seenImage by lazy {
        findViewById<ImageView>(R.id.seenImage)
    }
    private val shareImage by lazy {
        findViewById<ImageView>(R.id.shareImage)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.multiple_animation_example)
        motionLayout.setTransitionListener(this)

        findViewById<RecyclerView>(R.id.recyclerView).adapter = ItemRecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView1).adapter = ItemRecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView2).adapter = ItemRecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView3).adapter = ItemRecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView4).adapter = ItemRecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView5).adapter = ItemRecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView6).adapter = ItemRecyclerAdapter()
        findViewById<RecyclerView>(R.id.recyclerView7).adapter = ItemRecyclerAdapter()
    }

    override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
    }

    override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
    }

    override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
    }

    override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
        if(p0 == null)
            return
        doBounceAnimation(favImage)
        doBounceAnimation(shareImage)
        doBounceAnimation(seenImage)

    }

    private fun doBounceAnimation(targetView: View) {
        val animator = ObjectAnimator.ofFloat(targetView, "translationY", 0f, -10f, 0f)
        animator.interpolator = BounceInterpolator()
        animator.duration = 1000
        animator.start()
    }
}