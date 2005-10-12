/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package </b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * Schema file for the chart.model package.
 * 
 * <!-- end-model-doc -->
 * 
 * @see org.eclipse.birt.chart.model.ModelFactory
 * @generated
 */
public interface ModelPackage extends EPackage
{

	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.birt.eclipse.org/ChartModel"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipse.birt.chart.model.impl.ModelPackageImpl.init( );

	/**
	 * The meta object id for the '{@link org.eclipse.birt.chart.model.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.birt.chart.model.impl.ChartImpl
	 * @see org.eclipse.birt.chart.model.impl.ModelPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART__SUB_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART__DIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART__SCRIPT = 6;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART__UNITS = 7;

	/**
	 * The feature id for the '<em><b>Series Thickness</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SERIES_THICKNESS = 8;

	/**
	 * The feature id for the '<em><b>Grid Column Count</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__GRID_COLUMN_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Extended Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__EXTENDED_PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Sample Data</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__SAMPLE_DATA = 11;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__STYLES = 12;

	/**
	 * The number of structural features of the the '<em>Chart</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.birt.chart.model.impl.ChartWithAxesImpl <em>Chart With Axes</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.birt.chart.model.impl.ChartWithAxesImpl
	 * @see org.eclipse.birt.chart.model.impl.ModelPackageImpl#getChartWithAxes()
	 * @generated
	 */
	int CHART_WITH_AXES = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__VERSION = CHART__VERSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__TYPE = CHART__TYPE;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__SUB_TYPE = CHART__SUB_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__DESCRIPTION = CHART__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__BLOCK = CHART__BLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__DIMENSION = CHART__DIMENSION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__SCRIPT = CHART__SCRIPT;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__UNITS = CHART__UNITS;

	/**
	 * The feature id for the '<em><b>Series Thickness</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__SERIES_THICKNESS = CHART__SERIES_THICKNESS;

	/**
	 * The feature id for the '<em><b>Grid Column Count</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__GRID_COLUMN_COUNT = CHART__GRID_COLUMN_COUNT;

	/**
	 * The feature id for the '<em><b>Extended Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__EXTENDED_PROPERTIES = CHART__EXTENDED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sample Data</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__SAMPLE_DATA = CHART__SAMPLE_DATA;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__STYLES = CHART__STYLES;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__AXES = CHART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wall Fill</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__WALL_FILL = CHART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Floor Fill</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__FLOOR_FILL = CHART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__ORIENTATION = CHART_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unit Spacing</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__UNIT_SPACING = CHART_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES__ROTATION = CHART_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>Chart With Axes</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITH_AXES_FEATURE_COUNT = CHART_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.birt.chart.model.impl.ChartWithoutAxesImpl <em>Chart Without Axes</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.birt.chart.model.impl.ChartWithoutAxesImpl
	 * @see org.eclipse.birt.chart.model.impl.ModelPackageImpl#getChartWithoutAxes()
	 * @generated
	 */
	int CHART_WITHOUT_AXES = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__VERSION = CHART__VERSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__TYPE = CHART__TYPE;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__SUB_TYPE = CHART__SUB_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__DESCRIPTION = CHART__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__BLOCK = CHART__BLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__DIMENSION = CHART__DIMENSION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__SCRIPT = CHART__SCRIPT;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__UNITS = CHART__UNITS;

	/**
	 * The feature id for the '<em><b>Series Thickness</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__SERIES_THICKNESS = CHART__SERIES_THICKNESS;

	/**
	 * The feature id for the '<em><b>Grid Column Count</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__GRID_COLUMN_COUNT = CHART__GRID_COLUMN_COUNT;

	/**
	 * The feature id for the '<em><b>Extended Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__EXTENDED_PROPERTIES = CHART__EXTENDED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sample Data</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__SAMPLE_DATA = CHART__SAMPLE_DATA;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__STYLES = CHART__STYLES;

	/**
	 * The feature id for the '<em><b>Series Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__SERIES_DEFINITIONS = CHART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__MIN_SLICE = CHART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Slice Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__MIN_SLICE_PERCENT = CHART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Slice Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES__MIN_SLICE_LABEL = CHART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Chart Without Axes</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_WITHOUT_AXES_FEATURE_COUNT = CHART_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.birt.chart.model.impl.DialChartImpl <em>Dial Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.birt.chart.model.impl.DialChartImpl
	 * @see org.eclipse.birt.chart.model.impl.ModelPackageImpl#getDialChart()
	 * @generated
	 */
	int DIAL_CHART = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__VERSION = CHART_WITHOUT_AXES__VERSION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__TYPE = CHART_WITHOUT_AXES__TYPE;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__SUB_TYPE = CHART_WITHOUT_AXES__SUB_TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__DESCRIPTION = CHART_WITHOUT_AXES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__BLOCK = CHART_WITHOUT_AXES__BLOCK;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__DIMENSION = CHART_WITHOUT_AXES__DIMENSION;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__SCRIPT = CHART_WITHOUT_AXES__SCRIPT;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__UNITS = CHART_WITHOUT_AXES__UNITS;

	/**
	 * The feature id for the '<em><b>Series Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__SERIES_THICKNESS = CHART_WITHOUT_AXES__SERIES_THICKNESS;

	/**
	 * The feature id for the '<em><b>Grid Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__GRID_COLUMN_COUNT = CHART_WITHOUT_AXES__GRID_COLUMN_COUNT;

	/**
	 * The feature id for the '<em><b>Extended Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__EXTENDED_PROPERTIES = CHART_WITHOUT_AXES__EXTENDED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sample Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__SAMPLE_DATA = CHART_WITHOUT_AXES__SAMPLE_DATA;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__STYLES = CHART_WITHOUT_AXES__STYLES;

	/**
	 * The feature id for the '<em><b>Series Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__SERIES_DEFINITIONS = CHART_WITHOUT_AXES__SERIES_DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Min Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__MIN_SLICE = CHART_WITHOUT_AXES__MIN_SLICE;

	/**
	 * The feature id for the '<em><b>Min Slice Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__MIN_SLICE_PERCENT = CHART_WITHOUT_AXES__MIN_SLICE_PERCENT;

	/**
	 * The feature id for the '<em><b>Min Slice Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__MIN_SLICE_LABEL = CHART_WITHOUT_AXES__MIN_SLICE_LABEL;

	/**
	 * The feature id for the '<em><b>Dial Superimposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART__DIAL_SUPERIMPOSITION = CHART_WITHOUT_AXES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Dial Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAL_CHART_FEATURE_COUNT = CHART_WITHOUT_AXES_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '
	 * {@link org.eclipse.birt.chart.model.Chart <em>Chart</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see org.eclipse.birt.chart.model.Chart
	 * @generated
	 */
	EClass getChart( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.Chart#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getVersion()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Version( );

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.eclipse.birt.chart.model.Chart#getType <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getType()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Type( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.Chart#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getSubType()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_SubType( );

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.birt.chart.model.Chart#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getDescription()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Description( );

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.birt.chart.model.Chart#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getBlock()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Block( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.Chart#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getDimension()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Dimension( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.Chart#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getScript()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Script( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.Chart#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getUnits()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Units( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.Chart#getSeriesThickness <em>Series Thickness</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series Thickness</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getSeriesThickness()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_SeriesThickness( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.Chart#getGridColumnCount <em>Grid Column Count</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Column Count</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getGridColumnCount()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_GridColumnCount( );

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.birt.chart.model.Chart#getExtendedProperties <em>Extended Properties</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extended Properties</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getExtendedProperties()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_ExtendedProperties( );

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.birt.chart.model.Chart#getSampleData <em>Sample Data</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sample Data</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getSampleData()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_SampleData( );

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.birt.chart.model.Chart#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see org.eclipse.birt.chart.model.Chart#getStyles()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Styles( );

	/**
	 * Returns the meta object for class '{@link org.eclipse.birt.chart.model.ChartWithAxes <em>Chart With Axes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart With Axes</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithAxes
	 * @generated
	 */
	EClass getChartWithAxes( );

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.birt.chart.model.ChartWithAxes#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axes</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithAxes#getAxes()
	 * @see #getChartWithAxes()
	 * @generated
	 */
	EReference getChartWithAxes_Axes( );

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.birt.chart.model.ChartWithAxes#getWallFill <em>Wall Fill</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wall Fill</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithAxes#getWallFill()
	 * @see #getChartWithAxes()
	 * @generated
	 */
	EReference getChartWithAxes_WallFill( );

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.birt.chart.model.ChartWithAxes#getFloorFill <em>Floor Fill</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Floor Fill</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithAxes#getFloorFill()
	 * @see #getChartWithAxes()
	 * @generated
	 */
	EReference getChartWithAxes_FloorFill( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.ChartWithAxes#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithAxes#getOrientation()
	 * @see #getChartWithAxes()
	 * @generated
	 */
	EAttribute getChartWithAxes_Orientation( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.ChartWithAxes#getUnitSpacing <em>Unit Spacing</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Spacing</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithAxes#getUnitSpacing()
	 * @see #getChartWithAxes()
	 * @generated
	 */
	EAttribute getChartWithAxes_UnitSpacing( );

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.birt.chart.model.ChartWithAxes#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithAxes#getRotation()
	 * @see #getChartWithAxes()
	 * @generated
	 */
	EReference getChartWithAxes_Rotation( );

	/**
	 * Returns the meta object for class '{@link org.eclipse.birt.chart.model.ChartWithoutAxes <em>Chart Without Axes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart Without Axes</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithoutAxes
	 * @generated
	 */
	EClass getChartWithoutAxes( );

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.birt.chart.model.ChartWithoutAxes#getSeriesDefinitions <em>Series Definitions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Series Definitions</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithoutAxes#getSeriesDefinitions()
	 * @see #getChartWithoutAxes()
	 * @generated
	 */
	EReference getChartWithoutAxes_SeriesDefinitions( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.ChartWithoutAxes#getMinSlice <em>Min Slice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Slice</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithoutAxes#getMinSlice()
	 * @see #getChartWithoutAxes()
	 * @generated
	 */
	EAttribute getChartWithoutAxes_MinSlice( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.ChartWithoutAxes#isMinSlicePercent <em>Min Slice Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Slice Percent</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithoutAxes#isMinSlicePercent()
	 * @see #getChartWithoutAxes()
	 * @generated
	 */
	EAttribute getChartWithoutAxes_MinSlicePercent( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.ChartWithoutAxes#getMinSliceLabel <em>Min Slice Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Slice Label</em>'.
	 * @see org.eclipse.birt.chart.model.ChartWithoutAxes#getMinSliceLabel()
	 * @see #getChartWithoutAxes()
	 * @generated
	 */
	EAttribute getChartWithoutAxes_MinSliceLabel( );

	/**
	 * Returns the meta object for class '{@link org.eclipse.birt.chart.model.DialChart <em>Dial Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dial Chart</em>'.
	 * @see org.eclipse.birt.chart.model.DialChart
	 * @generated
	 */
	EClass getDialChart( );

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.birt.chart.model.DialChart#isDialSuperimposition <em>Dial Superimposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dial Superimposition</em>'.
	 * @see org.eclipse.birt.chart.model.DialChart#isDialSuperimposition()
	 * @see #getDialChart()
	 * @generated
	 */
	EAttribute getDialChart_DialSuperimposition( );

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory( );

} //ModelPackage
