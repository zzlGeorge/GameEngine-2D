/** 
 * FrameAnimation Class 
 */
package george.game.engine.various_animation;

import george.game.engine.Animation;

public class FrameAnimation extends Animation {
    private int p_firstFrame;
    private int p_lastFrame;
    private int p_direction;
    
    public FrameAnimation(int firstFrame, int lastFrame, int direction) {
        animating = true;
        p_firstFrame = firstFrame;
        p_lastFrame = lastFrame;
        p_direction = direction;
    }

    @Override
    public int adjustFrame(int original) {
        int modified = original + p_direction;
        if (modified < p_firstFrame)
            modified = p_lastFrame;
        else if (modified > p_lastFrame)
            modified = p_firstFrame;
        return modified;
    }

}
