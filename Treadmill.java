public class Treadmill extends ObstacleCourse {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Skills runner) {
        runner.run(distance);

    }
}