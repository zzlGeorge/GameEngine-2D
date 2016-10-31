/** 
 * Animation Class 
 * Requires game.engine.Engine to build.
 */
package george.game.engine;

import android.graphics.Point;
import android.renderscript.Float2;

public class Animation {
	public boolean animating;

	public Animation() {
		animating = false;
	}

	public int adjustFrame(int original) {
		return original;
	}

	public int adjustAlpha(int original) {
		return original;
	}

	public Float2 adjustScale(Float2 original) {
		return original;
	}

	public float adjustRotation(float original) {
		return original;
	}

	public Float2 adjustPosition(Float2 original) {
		return original;
	}

	public Float2 adjustVelocity(Float2 original) {
		return original;
	}

	public boolean adjustAlive(boolean original) {
		return original;
	}
}
