import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> lowLi = new ArrayList<>();
        List<Character> upLi = new ArrayList<>();

        // 소문자 리스트 생성
        for (char c = 'a'; c <= 'z'; c++) {
            lowLi.add(c);
        }

        // 대문자 리스트 생성 및 lowLi에 추가
        for (char c : lowLi) {
            upLi.add(Character.toUpperCase(c));
        }
        lowLi.addAll(upLi);

        while (true) {
            try {
                int N = Integer.parseInt(scanner.nextLine());
                Map<String, Integer> li = new HashMap<>();
                List<String> newWord = new ArrayList<>();

                while (true) {
                    String inputLine = scanner.nextLine();
                    if (inputLine.equals("EndOfText")) {
                        Collections.sort(newWord);
                        boolean found = false;

                        // Map을 문자열 오름차순으로 정렬
                        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(li.entrySet());
                        sortedEntries.sort(Map.Entry.comparingByKey());

                        for (Map.Entry<String, Integer> entry : sortedEntries) {
                            if (entry.getValue() == N) {
                                System.out.println(entry.getKey());
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("There is no such word.");
                        }
                        break;
                    }

                    // 단어 처리
                    String[] words = inputLine.split("\\s+");
                    for (String word : words) {
                        StringBuilder alp = new StringBuilder();
                        for (char j : word.toCharArray()) {
                            if (lowLi.contains(Character.toLowerCase(j))) {
                                alp.append(Character.toLowerCase(j));
                            } else {
                                if (alp.length() > 0) {
                                    newWord.add(alp.toString());
                                    li.put(alp.toString(), li.getOrDefault(alp.toString(), 0) + 1);
                                    alp.setLength(0);
                                }
                            }
                        }
                        if (alp.length() > 0) {
                            newWord.add(alp.toString());
                            li.put(alp.toString(), li.getOrDefault(alp.toString(), 0) + 1);
                        }
                    }
                }
                System.out.println();

            } catch (Exception e) {
                break;
            }
        }

        scanner.close();
    }
}