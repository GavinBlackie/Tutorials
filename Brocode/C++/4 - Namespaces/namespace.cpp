#include <iostream>

/* "You can have different versions of a variable, as long
as they are in a different scope/namespace"
*/

namespace first {
    int x = 1;
};

namespace second {
    int x = 2;
}

// not common b/c std has a lot of funcs
//using namespace std;

// Can do this instead to "import" a single object or func
using std::cout;

int main() {

    // Namespace = solution fro preventing name conflicts
    //             in large projects. Also provides a way
    //             to import named entities (objects, funcs)
    //             A namespace allows for identically named
    //             entities as long as the namespaces are different


    using namespace first; // using a namespace in func

    //int x = 0;

    // Recall :: is the scope resolution operator

    std::cout << x          << std::endl;
    std::cout << x   << std::endl;
    std::cout << second::x  << std::endl;

    cout << "Wow! I am printing using namespace syntax";

    return 0;
}