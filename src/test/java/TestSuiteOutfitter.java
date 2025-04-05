import io.github.william_hood.koarse_grind_java.Outfitter;

public class TestSuiteOutfitter extends Outfitter {
	@Override
    public void setup() {
        assertion().shouldBeTrue(true, "Suite-level setup ran!");
    }

	@Override
    public void cleanup() {
        assertion().shouldBeTrue(true, "Suite-level cleanup ran!");
    }
}
