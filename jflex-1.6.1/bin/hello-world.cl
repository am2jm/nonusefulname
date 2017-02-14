class Main inherits IO {
    main() : SELF_TYPE {
        {
            out_string((new Object).type_name().substr(4,1)).
            out_string((* please work *)(isvoid self).type_name().substr(1,3));
            out_string("\n");
        }
    };
};
