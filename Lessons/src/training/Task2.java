package training;

public class Task2 {


    public int processingInputLines(String gameIds, String downloads) {
        String[] quantityDownloads = downloads.split(",");
        int sum = 0;

        for (String number : quantityDownloads) {
            int value = Integer.parseInt(number);
            sum += value;
        }

        String[] quantityGameIds = gameIds.split(",");
        int quantityGame = quantityGameIds.length;

        double average = (double) sum / quantityGame;
        int count = 0;

        for (String quantityDownload : quantityDownloads) {
            int download = Integer.parseInt(quantityDownload);

            if (download < average) {
                count++;
            }

        }


        return 0;
    }
}
