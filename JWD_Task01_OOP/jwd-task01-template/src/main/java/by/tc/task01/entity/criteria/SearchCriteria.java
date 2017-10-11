package by.tc.task01.entity.criteria;

public final class SearchCriteria {
	
	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH;

		public static boolean containsProperty(String value) {
			for (Oven property : values()) {
				if (property.isProperty(value)) {
					return true;
				}
			}
			return false;
		}

		public boolean isProperty(String property) {
			return name().equalsIgnoreCase(property);
		}
	}
	
	public static enum Laptop{
		BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS;

		public static boolean containsProperty(String value) {
			for (Laptop property : values()) {
				if (property.isProperty(value)) {
					return true;
				}
			}
			return false;
		}

		public boolean isProperty(String property) {
			return name().equalsIgnoreCase(property);
		}
	}
	
	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH;

		public static boolean containsProperty(String value) {
			for (Refrigerator property : values()) {
				if (property.isProperty(value)) {
					return true;
				}
			}
			return false;
		}

		public boolean isProperty(String property) {
			return name().equalsIgnoreCase(property);
		}
	}
	
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH;

		public static boolean containsProperty(String value) {
			for (VacuumCleaner property : values()) {
				if (property.isProperty(value)) {
					return true;
				}
			}
			return false;
		}

		public boolean isProperty(String property) {
			return name().equalsIgnoreCase(property);
		}
	}
	
	public static enum TabletPC{
		BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR;

		public static boolean containsProperty(String value) {
			for (TabletPC property : values()) {
				if (property.isProperty(value)) {
					return true;
				}
			}
			return false;
		}

		public boolean isProperty(String property) {
			return name().equalsIgnoreCase(property);
		}
	}
	
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH;

		public static boolean containsProperty(String value) {
			for (Speakers property : values()) {
				if (property.isProperty(value)) {
					return true;
				}
			}
			return false;
		}

		public boolean isProperty(String property) {
			return name().equalsIgnoreCase(property);
		}
	}
	
	private SearchCriteria() {}
}