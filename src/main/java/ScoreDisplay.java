import zero.ui.Element;
import zero.ui.Label;

public class ScoreDisplay {
    private final Label label = new Label("Score: 0");
    private String caption = "Score";
    private int points;
// Displays the score 
    public void setScore(int points) {
        this.points = points;
        refresh();
    }

    private void refresh() {
        label.setText(caption + ": " + points);
    }
// Changes the caption/name of the coin counter
    public void setCaption(String caption) {
        if (caption == null) {
            throw new IllegalArgumentException("Score caption must not be null.");
        }
        this.caption = caption;
        refresh();
    }
// Gives the calling class an element
    public Element view() {
        return label;
    }
}