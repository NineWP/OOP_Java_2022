import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
public class ClockPane extends Pane{
	// Create required variable
    private int hour;
	private int minute;
	private int second;
	private boolean hourHandVisible;
	private boolean minuteHandVisible;
	private boolean secondHandVisible;

	// clock pane width and height
	private double w = 250, h = 250;

	public ClockPane() { //set a clock with the current time 
		setCurrentTime();
	}

	public ClockPane(int hour, int minute, int second) { // construct with hour minute and second
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		hourHandVisible = true;
		minuteHandVisible = true;
		secondHandVisible = true;
		paintClock();
	}

	// method set and get
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		paintClock();
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
		paintClock();
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
		paintClock();
	}

	public double getW() {
		return w;
	}

	public void getW(double w) {
		this.w = w;
		paintClock();
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
		paintClock();
	}

	public boolean isHourHandVisible() {
		return hourHandVisible;
	}

	public void setHourHandVisible(boolean hourHandVisible) {
		this.hourHandVisible = hourHandVisible;
		paintClock();
	}

	public boolean isMinuteHandVisible() {
		return minuteHandVisible;
	}

	public void setMinuteHandVisible(boolean minuteHandVisible) {
		this.minuteHandVisible = minuteHandVisible;
		paintClock();
	}

	public boolean isSecondHandVisible() {
		return secondHandVisible;
	}

	public void setSecondHandVisible(boolean secondHandVisible) {
		this.secondHandVisible = secondHandVisible;
		paintClock();
	}

	// set the current time for the clock
	public void setCurrentTime() { 
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
		paintClock();
	}
	
	// paint/draw the clock
	protected void paintClock() {
		double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		double centerX = w / 2;
		double centerY = h / 2;

		Circle circle = new Circle(centerX, centerY, clockRadius);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
		Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
		Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
		Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

		double sLength = clockRadius * 0.8;
		double secondX = centerX + sLength *
			Math.sin(second * (2 * Math.PI / 60));
		double secondY = centerY - sLength *
			Math.cos(second * (2 * Math.PI / 60));
		Line sLine = new Line(centerX, centerY, secondX, secondY);
		sLine.setStroke(Color.RED);

		double mLength = clockRadius * 0.65;
		double xMinute = centerX + mLength *
			Math.sin(minute * (2 * Math.PI / 60));
		double minuteY = centerY - mLength *
			Math.cos(minute * (2 * Math.PI / 60));
		Line mLine = new Line(centerX, centerY, xMinute, minuteY);
		mLine.setStroke(Color.BLUE);

		double hLength = clockRadius * 0.5;
		double hourX = centerX + hLength *
			Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		double hourY = centerY - hLength * 
			Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
		Line hLine = new Line(centerX, centerY, hourX, hourY);
		hLine.setStroke(Color.GREEN);

		getChildren().clear();
		getChildren().addAll(circle, t1, t2, t3, t4); 
		if (secondHandVisible)
			getChildren().add(sLine);
		if (minuteHandVisible)
			getChildren().add(mLine);
		if (hourHandVisible)
			getChildren().add(hLine);
	}
}
