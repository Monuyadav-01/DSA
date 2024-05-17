public class Problem2383 {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {

        int total = 0;

        for (int i = 0; i < energy.length; i++) {
            int diff = 0;
            if (energy[i] >= initialEnergy) {
                diff = energy[i] - initialEnergy + 1;
                total = total + diff;
                //update my initialEnergy
                initialEnergy = initialEnergy + diff;
            }
            //decrease my energy
            initialEnergy = initialEnergy - energy[i];

            // for initialExperience

            if (initialExperience <= experience[i]) {
                diff = experience[i] - initialExperience + 1;
                total = total + diff;
                initialExperience = initialExperience + diff;
            }

            initialExperience = initialExperience + experience[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int initialEnergy = 5;
        int initialExperience = 3;
        int energy[] = { 1, 4, 3, 2 };
        int experience[] = { 2, 6, 3, 1 };
        System.out.println(minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }
}
