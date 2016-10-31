/** 
 * FenceBehavior Class
 */
package george.game.engine.various_animation;

import george.game.engine.Animation;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.renderscript.Float2;

public class FenceBehavior extends Animation {
	private RectF p_fence;

	public FenceBehavior(RectF fence) {
		p_fence = fence;
		animating = true;
	}

	@Override
	public Float2 adjustPosition(Float2 original) {
		Float2 modified = original;

		if (modified.x < p_fence.left)
			modified.x = p_fence.left;
		else if (modified.x > p_fence.right)
			modified.x = p_fence.right;
		if (modified.y < p_fence.top)
			modified.y = p_fence.top;
		else if (modified.y > p_fence.bottom)
			modified.y = p_fence.bottom;

		return modified;
	}

}
