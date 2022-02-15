package com.company.jmix_kotlin_addon.screen.foo;

import com.company.jmix_kotlin_addon.entity.Foo;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.*;

@UiController("tmp_Foo.browse")
@UiDescriptor("foo-browse.xml")
@LookupComponent("foosTable")
@Route("foos")
public class FooBrowse extends StandardLookup<Foo> {
}