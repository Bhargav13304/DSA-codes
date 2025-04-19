public class Main {
    public static void main(String[] args) {
      Trie trie = new Trie();
  
      trie.insert("bat");
      trie.insert("ball");
      trie.insert("bats");
  
      trie.search("bat");
      trie.search("ball");
      trie.search("bats");
      trie.search("ba");     // prefix, not a full word
  
      trie.delete("bat");    // deletes only 'bat', keeps 'bats' and 'ball' intact
      trie.search("bat");    // should not be found
      trie.search("bats");   // should still exist
      trie.search("ball");   // should still exist
  
      trie.delete("bats");
      trie.delete("ball");
      trie.search("bats");   // should not be found
      trie.search("ball");   // should not be found
    }
  }
  