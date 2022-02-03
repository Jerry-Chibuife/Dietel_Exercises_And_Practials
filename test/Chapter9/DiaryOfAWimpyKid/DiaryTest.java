package Chapter9.DiaryOfAWimpyKid;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DiaryTest {

        Diary diary;
        @BeforeEach
        public void BeforeEachTest(){
            diary = new Diary("Joseph", "123456789");
        }

        @Test
        public void diaryCanBeCreatedAndOwnerNameCanBeValidated(){
            assertEquals("Joseph", diary.getOwnerName());
            assertNotNull(diary);
        }

        @Test
        public void diaryPasswordCanBeUpdated(){
            diary.setPassword("mynameisWHAT?");
            assertEquals("mynameisWHAT?", diary.getPassword());
        }

        @Test
        public void diaryCanAddNewEntries(){
            diary.addNewEntry("The Day The World Stood Still", "The world was shocked to realize that...", "123456789");
            assertEquals(1, diary.getEntries("123456789").size());
        }

        @Test
        public void gistCanBeFoundByTitle(){
            diary.addNewEntry("Jon Jonzz's Journal", "The Martian Man-hunter was obsessed with..", "123456789");
            diary.addNewEntry("The Bat Notes", "I choose to protect people, like I should have protected my parents...", "123456789");
            diary.addNewEntry("DareDevil's Apologetics", "Is there a God anymore?", "123456789");

            assertEquals(3, diary.getEntries("123456789").size());

            Entry foundEntry = diary.findEntryByTitle("Jon Jonzz's Journal");
            assertEquals("Jon Jonzz's Journal", foundEntry.getTitle());
            assertEquals("The Martian Man-hunter was obsessed with..", foundEntry.getGist());

        }

        @Test
        public void gistCanBeDeleted(){
            diary.addNewEntry("Jon Jonzz's Journal", "The Martian Man-hunter was obsessed with..", "123456789");
            diary.addNewEntry("The Bat Notes", "I choose to protect people, like I should have protected my parents...", "123456789");
            diary.addNewEntry("DareDevil's Apologetics", "Is there a God anymore?", "123456789");

            assertEquals(3, diary.getEntries("123456789").size());

            diary.deleteOneEntry("Jon Jonzz's Journal", "123456789");

            assertEquals(2, diary.getEntries("123456789").size());
        }

        @Test
        public void gistDeletedWillNotBeFoundAgain(){
            diary.addNewEntry("Jon Jonzz's Journal", "The Martian Man-hunter was obsessed with..", "123456789");
            diary.addNewEntry("The Bat Notes", "I choose to protect people, like I should have protected my parents...", "123456789");
            diary.addNewEntry("DareDevil's Apologetics", "Is there a God anymore?", "123456789");

            assertEquals(3, diary.getEntries("123456789").size());

            diary.deleteOneEntry("Jon Jonzz's Journal", "123456789");

            assertEquals(2, diary.getEntries("123456789").size());
        }


        @Test
        public void weCanViewAllGist(){
            diary.addNewEntry("Jon Jonzz's Journal", "The Martian Man-hunter was obsessed with..", "123456789");
            diary.addNewEntry("The Bat Notes", "I choose to protect people, like I should have protected my parents...", "123456789");
            diary.addNewEntry("DareDevil's Apologetics", "Is there a God anymore?", "123456789");

            assertEquals(3, diary.getEntries("123456789").size());

            diary.viewAllGist("123456789");

        }

        @Test
        public void markGistAsHotGist(){
            diary.addNewEntry("Jon Jonzz's Journal", "The Martian Man-hunter was obsessed with..", "123456789");
            diary.addNewEntry("The Bat Notes", "I choose to protect people, like I should have protected my parents...", "123456789");
            diary.addNewEntry("DareDevil's Apologetics", "Is there a God anymore?", "123456789");

            assertEquals(3, diary.getEntries("123456789").size());

            diary.markAsFavourite("The Bat Notes", "123456789");

            assertEquals(1, diary.getFavourites("123456789").size());
        }
    }
