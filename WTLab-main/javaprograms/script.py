# python3 script.py <filename>
import os
import sys

def create_java_file(fname):
  template = """import java.util.*;

public class %s {
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println();
  }
}

  """ % fname
  try:
    f = open('./' + fname + '.java', "w+")
    f.write(template)
    f.close()
    print(f"Successfully created {fname}.java")
  except: 
    print("Error creating java file")

if __name__ == '__main__':
  filename=''
  for x in sys.argv:
    if x is not 'script.py':
      filename = x
  create_java_file((filename))
