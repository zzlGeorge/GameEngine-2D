/** 
 * AlphaAnimation Class 
 */

package george.game.engine.various_animation;

import george.game.engine.Animation;

public class AlphaAnimation extends Animation {
    private int p_minAlpha;
    private int p_maxAlpha;
    private int p_change;
    
    public AlphaAnimation(int minAlpha, int maxAlpha, int change) {
        this.p_minAlpha = minAlpha;
        this.p_maxAlpha = maxAlpha;
        this.p_change = change;
        animating = true;
    }
    
    @Override
    public int adjustAlpha(int original) {
        int modified = original;
        modified += p_change;
        if (modified < p_minAlpha) {
            modified = p_minAlpha;
            animating = false;
        }
        if (modified > p_maxAlpha) {
            modified = p_maxAlpha;
            animating = false;
        }
        return modified;
    }

}
