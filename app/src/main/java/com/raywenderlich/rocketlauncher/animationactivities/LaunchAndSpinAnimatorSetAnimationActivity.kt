package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchAndSpinAnimatorSetAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

    valueAnimator.addUpdateListener {
      val value = it.animatedValue as Float
      rocket.translationY = value
    }

    valueAnimator.interpolator = LinearInterpolator()
    valueAnimator.duration = BaseAnimationActivity.Companion.DEFAULT_ANIMATION_DURATION

    valueAnimator.start()
  }
}
