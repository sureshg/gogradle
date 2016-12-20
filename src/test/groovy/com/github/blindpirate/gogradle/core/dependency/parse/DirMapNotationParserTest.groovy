package com.github.blindpirate.gogradle.core.dependency.parse

import com.github.blindpirate.gogradle.core.dependency.GolangDependency
import com.github.blindpirate.gogradle.core.dependency.LocalDirectoryDependency
import org.junit.Test

class DirMapNotationParserTest {

    DirMapNotationParser parser = new DirMapNotationParser()

    @Test
    void 'notation with dir should be parsed correctly'() {
        // when
        GolangDependency dependency = parser.parse([name: 'name', dir: 'dir'])

        // then
        assert dependency instanceof LocalDirectoryDependency
        assert dependency.name == 'name'
        assert dependency.dir == 'dir'
    }
}
