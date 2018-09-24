public class Main {

    public static void main(String[] args) {
	double drone1X = 5;
	double drone1Y = 2;
	double drone1Z = -5;

	double drone2X = 4;
	double drone2Y = 9;
	double drone2Z = 2;

	double drone3X = -3;
	double drone3Y = 2;
	double drone3Z = 6;

	double ddistance1to2 = Math.sqrt(Math.pow(drone1X - drone2X, 2) + Math.pow(drone1Y - drone2Y, 2) + Math.pow(drone1Z - drone2Z, 2));
	double ddistance2to3 = Math.sqrt(Math.pow(drone2X - drone3X, 2) + Math.pow(drone2Y - drone3Y, 2) + Math.pow(drone2Z - drone3Z, 2));
	double ddistance1to3 = Math.sqrt(Math.pow(drone1X - drone3X, 2) + Math.pow(drone1Y - drone3Y, 2) + Math.pow(drone1Z - drone3Z, 2));

	double max = 0;
		if (ddistance1to2 > ddistance2to3 && ddistance1to2 > ddistance1to3)
			max = ddistance1to2;

		if (ddistance2to3 > ddistance1to2 && ddistance2to3 > ddistance1to3)
			max = ddistance2to3;

		if (ddistance1to3 > ddistance2to3 && ddistance1to3 > ddistance1to2)
			max = ddistance1to3;

		double min = 0;
			if (ddistance1to2 < ddistance2to3 && ddistance1to2 < ddistance1to3)
				min = ddistance1to2;

			if (ddistance2to3 < ddistance1to2 && ddistance2to3 < ddistance1to3)
				min = ddistance2to3;

			if (ddistance1to3 < ddistance2to3 && ddistance1to3 < ddistance1to2)
				min = ddistance1to3;

	System.out.println(max);
	System.out.println(min);


    }
}
