package Chapter7.Practice;


public class JerryList<O> {
    private String[] newObject = new String[]{};
    private String[] saveObject = new String[5];
    private String[] newObject1 = new String[5];
    private int count = 0;
    private int counter = 1;


    public void add(String value) {
        if (saveObject.length - 1 == count) {
            saveObject = new String[saveObject.length * 2];
            System.arraycopy(newObject1, 0, saveObject, 0, newObject1.length);
        }
        if (newObject1.length - 1 == count) {
            newObject1 = new String[newObject1.length * 2];
            System.arraycopy(saveObject, 0, newObject1, 0, saveObject.length);
        }
        newObject = new String[counter];
        newObject1[count] = value;
        saveObject[count] = newObject1[count];
        for(int a = 0; a < newObject.length; a++) {
            if(newObject[a] == null)
                newObject[a] = saveObject[a];
        }
//        System.out.println(newObject[count]);
        this.count++;
        this.counter = 1 + newObject.length;
    }

    public int getSize() {
        int number = 0;
        for (String o : newObject)
            if (o != null)
                number++;
        return number;
    }


    public int getCapacity() {
        return newObject.length;
    }

    public void delete() {
        int controlNumber = 1;
        saveObject = newObject;
        while(controlNumber != 2){
            saveObject[saveObject.length - 1] = null;
            controlNumber++;
        }
        newObject = new String[saveObject.length-1];
        for(int b= 0; b<newObject.length; b++){
//            if(saveObject[b] != null)
                newObject[b] = saveObject[b];
        }
    }

    public String printListValues() {
        String[] result = newObject;
        String save = "";
        StringBuilder builder = new StringBuilder();
        for(int k = 0; k < newObject.length; k++){
            save = result[k];
            builder.append(save).append("\n");
        }
        return builder.toString();
    }

    public void add(String value, int index) {
        if(newObject == null){
            newObject = new String[index+1];
            newObject[index] = value;
        }
        else {
            saveObject = newObject;
            newObject = new String[saveObject.length+1];
            for(int a = 0; a < newObject.length; a++){
                if(a < index){
                    newObject[a] = saveObject[a];
                }
                else if(a == index){
                    newObject[a] = value;
                }
                else {
                    newObject[a] = saveObject[a-1];
                }
            }
        }
    }

    public void delete(int index) {
        saveObject = newObject;
        newObject = new String[saveObject.length-1];
        for(int a = 0; a < newObject.length; a++){
            if(a < index){
                newObject[a] = saveObject[a];
            }
            else {
                newObject[a] = saveObject[a+1];
            }
        }
    }


    public void delete(String value) {
        saveObject = newObject;
        newObject = new String[saveObject.length-1];
        for(int a = 0; a<saveObject.length; a++){
            if(saveObject[a].equals(value))
                saveObject[a] = null;
        }
        for (int b = 0; b<newObject.length; b++){
            if(saveObject[b] != null)
                newObject[b] = saveObject[b];
            else
                newObject[b] = saveObject[b+1];
        }
    }
}
