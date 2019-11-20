package org.folio.processing.mapping.mapper.reader.factory;

import org.folio.processing.mapping.mapper.reader.MarcBibliographicReader;
import org.folio.processing.mapping.mapper.reader.Reader;
import org.folio.processing.mapping.model.context.MappingProfile;

import static org.folio.processing.mapping.model.context.MappingProfile.EntityType.MARC_BIBLIOGRAPHIC;

public class MarcBibliographicReaderFactory implements ReaderFactory {
    @Override
    public Reader createReader() {
        return new MarcBibliographicReader();
    }

    @Override
    public MappingProfile.EntityType getEntityType() {
        return MARC_BIBLIOGRAPHIC;
    }
}
