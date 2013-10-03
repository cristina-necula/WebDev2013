package impl;

public class Examples {

	public Function add_one;

	public Function add_two;

	public Function add_three;

	public Function multiply_by_3;

	public Function multiply_by_5;

	public Examples() {

		add_one = new Function() {

			@Override
			public Integer calculate(Integer number) {
				return number + 1;
			}
		};

		add_two = new Function() {

			@Override
			public Integer calculate(Integer number) {
				return number + 2;
			}
		};

		add_three = new Function() {

			@Override
			public Integer calculate(Integer number) {
				return number + 3;
			}
		};

		multiply_by_3 = new Function() {

			@Override
			public Integer calculate(Integer number) {
				return number * 3;
			}
		};

		multiply_by_5 = new Function() {

			@Override
			public Integer calculate(Integer number) {
				return number * 5;
			}
		};

	}
}
