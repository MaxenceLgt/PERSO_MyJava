package ex_06;

public class Ex06 {
    public void sequence(int nbr) {
        String sequence = "1";
        StringBuilder nextSequence = null;
        int count = 0;

        if (nbr < 0)
            return;
        System.out.println(sequence);
        for (int i = 1; i < nbr; i++) {
            nextSequence = new StringBuilder();
            count = 1;
            for (int parser = 1; parser < sequence.length(); parser++) {
                if (sequence.charAt(parser) != sequence.charAt(parser - 1)) {
                    nextSequence.append(count);
                    nextSequence.append(sequence.charAt(parser - 1));
                    count = 1;
                } else
                    count ++;
            }
            nextSequence.append(count);
            nextSequence.append(sequence.charAt(sequence.length() - 1));
            sequence = nextSequence.toString();
            System.out.println(sequence);
        }
    }
}
