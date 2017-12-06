using System;
using System.Collections.Generic;
using System.Linq;

namespace collections
{
  class Program
  {
    static void Main()
    {

      var names = new List<string>
      {
        "Trey Lanzer",

        "Felipe",

        "Emillia"
      };

      foreach (var name in names)
      {

        Console.WriteLine($"Hello {name.ToUpper()}!");

      }
    }
  }
}
