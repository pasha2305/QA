import org.junit.Assert;
import org.junit.Test;


class SkipListTest {

    @Test
    void delete() {
        SkippableList<Integer> list = new SkipList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        Assert.assertTrue(list.delete(2));
    }

    @Test
    void deleteMissing(){
        SkippableList<Integer> list = new SkipList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        Assert.assertFalse(list.delete(10));
    }

    @Test
    void deleteOneOfMany(){
        SkippableList<Integer> list = new SkipList<>();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        Assert.assertTrue(list.delete(2));
    }

    @Test
    void search(){
        SkippableList<Integer> list = new SkipList<>();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        Assert.assertNotEquals(list.search(3),list.search(4));
    }

    @Test
    void searchMissing(){
        SkippableList<Integer> list = new SkipList<>();
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        Assert.assertEquals(list.search(10),null);
    }
}
