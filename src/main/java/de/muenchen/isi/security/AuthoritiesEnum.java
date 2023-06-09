/*
 * Copyright (c): it@M - Dienstleister für Informations- und Telekommunikationstechnik
 * der Landeshauptstadt München, 2022
 */
package de.muenchen.isi.security;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Each possible authority in this project is represented by an enum.
 * The enums are used within the {@link PagingAndSortingRepository}
 * in the annotation e.g. {@link PreAuthorize}.
 */
public enum AuthoritiesEnum {
    ISI_BACKEND_READ_ABFRAGE,
    ISI_BACKEND_WRITE_ABFRAGE,
    ISI_BACKEND_DELETE_ABFRAGE,

    ISI_BACKEND_FREIGABE_ABFRAGE,
    ISI_BACKEND_ABBRECHEN_ABFRAGE,
    ISI_BACKEND_ANGABEN_ANPASSEN_ABFRAGE,
    ISI_BACKEND_WEITERE_ABFRAGEVARIANTEN_ANLEGEN_ABFRAGE,
    ISI_BACKEND_KEINE_ZUSAETZLICHE_ABFRAGEVARIANTE_ABFRAGE,
    ISI_BACKEND_ZUSAETZLICHE_ABFRAGEVARIANTE_ANLEGEN_ABFRAGE,
    ISI_BACKEND_SPEICHER_DER_VARIANTEN_ABFRAGE,
    ISI_BACKEND_KEINE_BEARBEITUNG_NOETIG_ABFRAGE,
    ISI_BACKEND_VERSCHICKEN_DER_STELLUNGNAHME_ABFRAGE,
    ISI_BACKEND_BEDARFSMELDUNG_ERFOLGT_ABFRAGE,
    ISI_BACKEND_SPEICHERN_VON_SOZIALINFRASTRUKTUR_VERSORGUNG_ABFRAGE,

    ISI_BACKEND_READ_BAURATE,
    ISI_BACKEND_WRITE_BAURATE,
    ISI_BACKEND_DELETE_BAURATE,

    ISI_BACKEND_READ_BAUVORHABEN,
    ISI_BACKEND_WRITE_BAUVORHABEN,
    ISI_BACKEND_DELETE_BAUVORHABEN,

    ISI_BACKEND_KOORDINATEN_TRANSFORM,

    ISI_BACKEND_LOOKUP_LIST,

    ISI_BACKEND_PRESIGNED_URL_GET_FILE,
    ISI_BACKEND_PRESIGNED_URL_SAVE_FILE,
    ISI_BACKEND_PRESIGNED_URL_DELETE_FILE,

    ISI_BACKEND_CALCULATE_WOHNEINHEITEN,

    ISI_BACKEND_READ_STAMMDATEN_FILEINFORMATION,

    ISI_BACKEND_READ_STAMMDATEN_FOERDERMIX,
    ISI_BACKEND_WRITE_STAMMDATEN_FOERDERMIX,
    ISI_BACKEND_DELETE_STAMMDATEN_FOERDERMIX,

    ISI_BACKEND_WRITE_STAMMDATEN_ORIENTIERUNGSWERTE,

    ISI_BACKEND_READ_KINDERKRIPPE,
    ISI_BACKEND_WRITE_KINDERKRIPPE,
    ISI_BACKEND_DELETE_KINDERKRIPPE,

    ISI_BACKEND_READ_KINDERGARTEN,
    ISI_BACKEND_WRITE_KINDERGARTEN,
    ISI_BACKEND_DELETE_KINDERGARTEN,

    ISI_BACKEND_READ_HAUS_FUER_KINDER,
    ISI_BACKEND_WRITE_HAUS_FUER_KINDER,
    ISI_BACKEND_DELETE_HAUS_FUER_KINDER,

    ISI_BACKEND_READ_GS_NACHMITTAG_BETREUUNG,
    ISI_BACKEND_WRITE_GS_NACHMITTAG_BETREUUNG,
    ISI_BACKEND_DELETE_GS_NACHMITTAG_BETREUUNG,

    ISI_BACKEND_READ_GRUNDSCHULE,
    ISI_BACKEND_WRITE_GRUNDSCHULE,
    ISI_BACKEND_DELETE_GRUNDSCHULE,

    ISI_BACKEND_READ_MITTELSCHULE,
    ISI_BACKEND_WRITE_MITTELSCHULE,
    ISI_BACKEND_DELETE_MITTELSCHULE,
}
