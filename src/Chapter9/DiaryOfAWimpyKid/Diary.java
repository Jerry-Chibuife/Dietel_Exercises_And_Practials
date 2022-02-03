package Chapter9.DiaryOfAWimpyKid;



import java.util.ArrayList;


public class Diary {
    private String ownerName;
    private ArrayList<Entry> entries = new ArrayList<>();
    private ArrayList<Entry> favourites = new ArrayList<>();
    private String password;

    public Diary(String ownerName, String password) {
        this.ownerName = ownerName;
        this.password = password;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<Entry> getEntries(String yourPassword) {
        if(yourPassword.equals(password))
            return entries;
        throw new IllegalArgumentException("Invalid password");
    }

    public void setEntries(ArrayList<Entry> entries) {
        this.entries = entries;
    }

    public String getPassword() {
//        StringBuilder builder = new StringBuilder();
//        builder.append("*".repeat(password.length()));
//        return builder.toString();
        return password;
    }

    public void setPassword(String password) {
        if(password == null && isAPasswordOfTrueLength(password))
            this.password = password;
        else validateLengthAndNonAvailabilityOfPassword(password);
        if(password != null)
            this.password = password;
    }

    private void validateLengthAndNonAvailabilityOfPassword(String password) {
        if(!(isAPasswordOfTrueLength(password)))
            System.out.println("Password has to have a length between 8 and 32 characters");
//        else if(password != null)
//            System.out.println("You already have a password");
    }

    private boolean isAPasswordOfTrueLength(String password) {
        return password.length() >= 8 && password.length() <= 32
                && !(password.contains(" "));
    }

    public void addNewEntry(String title, String entryConvo, String passcode) {
        if(passcode.equals(password)){
            Entry entry = new Entry(title, entryConvo);
            entries.add(entry);
        }
        else {
            throw new IllegalArgumentException("Invalid password");
        }

    }

    public Entry findEntryByTitle(String entryTitle) {
        for(Entry entry: entries){
            if(entry.getTitle().equalsIgnoreCase(entryTitle)) return entry;
        }
        throw new IllegalArgumentException("Entry not found");
    }

    public void deleteOneEntry(String title, String passcode) {
        Entry entry = findEntryByTitle(title);
        if(passcode.equals(password))
            if(entries.contains(entry))
                entries.remove(entry);
            else
                throw new IllegalArgumentException("Entry doesn't exist");
    }

    public void viewAllGist(String passcode) {
        if(passcode.equals(password))
            for(int i = 0; i < entries.size(); i++){
                System.out.print(getEntries(passcode).get(i).getTitle() + ": ");
                System.out.print(getEntries(passcode).get(i).getGist());
                System.out.println();
            }
    }


    public void markAsFavourite(String title, String passcode) {
        if(passcode.equals(password))
            for(Entry entry : entries){
                if(entry.getTitle().equalsIgnoreCase(title))
                    favourites.add(entry);
            }
    }

    public ArrayList<Entry> getFavourites(String yourPassword) {
        if(yourPassword.equals(password))
            return favourites;
        throw new IllegalArgumentException("Invalid password");
    }
}
