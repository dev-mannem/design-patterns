public class Microwave {
	public static void main(String[] args) {
		Microwave m = new Microwave();
		MicrowaveInterface mi = new Idle(m);
		System.out.println("Idle State");
		mi.reset();
		mi.poweron();
		mi.timer();
		mi.door_opened();
		mi.door_closed();
		mi.start();
		mi.time_out();
		System.out.println("");

		MicrowaveInterface mi1 = new Power_on(m);
		System.out.println("Power on State");
		mi1.reset();
		mi1.poweron();
		mi1.timer();
		mi1.door_opened();
		mi1.door_closed();
		mi1.start();
		mi1.time_out();
		System.out.println("");

		MicrowaveInterface mi2 = new Set_time(m);
		System.out.println("Set_time State");
		mi2.reset();
		mi2.poweron();
		mi2.timer();
		mi2.door_opened();
		mi2.door_closed();
		mi2.start();
		mi2.time_out();
		System.out.println("");

		MicrowaveInterface mi3 = new Operation_disabled(m);
		System.out.println("Operation Disabled State");
		mi3.reset();
		mi3.poweron();
		mi3.timer();
		mi3.door_opened();
		mi3.door_closed();
		mi3.start();
		mi3.time_out();
		System.out.println("");

		MicrowaveInterface mi4 = new Operation_enabled(m);
		System.out.println("Operation enabled State");
		mi4.reset();
		mi4.poweron();
		mi4.timer();
		mi4.door_opened();
		mi4.door_closed();
		mi4.start();
		mi4.time_out();
		System.out.println("");

		MicrowaveInterface mi5 = new Timed_operation(m);
		System.out.println("Timed_operation");
		mi5.reset();
		mi5.poweron();
		mi5.timer();
		mi5.door_opened();
		mi5.door_closed();
		mi5.start();
		mi5.time_out();
		System.out.println("");

		MicrowaveInterface mi6 = new Cooking_complete(m);
		System.out.println("Cooking Complete State");
		mi6.reset();
		mi6.poweron();
		mi6.timer();
		mi6.door_opened();
		mi6.door_closed();
		mi6.start();
		mi6.time_out();

	}
};
