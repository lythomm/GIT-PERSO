package Stack_integer_array is

   static_Maximum_Size : constant := 255;
   type Bounded_Stack is private ;

   top_empty_stack : exception;

   -- construit une pile vide de taille In_size_max
   function initialize (In_size_max : in Natural) return Bounded_Stack;

   -- ajoute un élément In_Data sur le stack
   -- nécessite not Is_Full(stack)
   procedure Push (stack : in out Bounded_Stack ; In_Data : in Integer);

   -- renvoie VRAI si le stack est vide
   -- FAUX sinon
   function Is_Empty (stack : in Bounded_Stack) return Boolean;

   -- renvoie le nombre maximal d'élément que le stack peut contenir
   function Maximal_Stack_Size (stack : in Bounded_Stack) return Natural;

   -- renvoie le nombre actuel d'élément dans le stack
   -- nécessite not Is_Empty(stack)
   function Current_Stack_Size (stack : in Bounded_Stack) return Natural;

   -- renvoie VRAI si le stack est rempli
   -- renvoie FAUX sinon
   -- nécessite not Is_Empty(stack)
   function Is_Full (stack : in  Bounded_Stack) return Boolean;

   -- renvoie le dernier élément du stack
   -- nécessite not Is_Empty(stack)
   -- lève top_empty_stack si le dernier élément du stack est vide
   function Top (stack : in Bounded_Stack) return Integer;

   -- retire un élément du stack
   -- nécessite not Is_Empty(stack)
   procedure Pop (stack : in out Bounded_Stack);

private

   type Tableau is array (1 .. static_Maximum_Size) of Integer;
   type Bounded_Stack is record
      Stack_List          : Tableau;
      Maximum_Size        : Natural;
      Top_Of_Stack        : Natural   := 0;
   end record;

end Stack_integer_array;
