/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.eclipse.birt.chart.model.attribute.impl;

import org.eclipse.birt.chart.model.attribute.AttributeFactory;
import org.eclipse.birt.chart.model.attribute.AttributePackage;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.FontDefinition;
import org.eclipse.birt.chart.model.attribute.Image;
import org.eclipse.birt.chart.model.attribute.Insets;
import org.eclipse.birt.chart.model.attribute.Style;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.StyleImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.StyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.StyleImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.StyleImpl#getBackgroundImage <em>Background Image</em>}</li>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.StyleImpl#getPadding <em>Padding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleImpl extends EObjectImpl implements Style
{

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected FontDefinition font = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected ColorDefinition color = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected ColorDefinition backgroundColor = null;

	/**
	 * The cached value of the '{@link #getBackgroundImage() <em>Background Image</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBackgroundImage()
	 * @generated
	 * @ordered
	 */
	protected Image backgroundImage = null;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected Insets padding = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleImpl( )
	{
		super( );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass( )
	{
		return AttributePackage.eINSTANCE.getStyle( );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FontDefinition getFont( )
	{
		return font;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont( FontDefinition newFont,
			NotificationChain msgs )
	{
		FontDefinition oldFont = font;
		font = newFont;
		if ( eNotificationRequired( ) )
		{
			ENotificationImpl notification = new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__FONT,
					oldFont,
					newFont );
			if ( msgs == null )
				msgs = notification;
			else
				msgs.add( notification );
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont( FontDefinition newFont )
	{
		if ( newFont != font )
		{
			NotificationChain msgs = null;
			if ( font != null )
				msgs = ( (InternalEObject) font ).eInverseRemove( this,
						EOPPOSITE_FEATURE_BASE - AttributePackage.STYLE__FONT,
						null,
						msgs );
			if ( newFont != null )
				msgs = ( (InternalEObject) newFont ).eInverseAdd( this,
						EOPPOSITE_FEATURE_BASE - AttributePackage.STYLE__FONT,
						null,
						msgs );
			msgs = basicSetFont( newFont, msgs );
			if ( msgs != null )
				msgs.dispatch( );
		}
		else if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__FONT,
					newFont,
					newFont ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDefinition getColor( )
	{
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor( ColorDefinition newColor,
			NotificationChain msgs )
	{
		ColorDefinition oldColor = color;
		color = newColor;
		if ( eNotificationRequired( ) )
		{
			ENotificationImpl notification = new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__COLOR,
					oldColor,
					newColor );
			if ( msgs == null )
				msgs = notification;
			else
				msgs.add( notification );
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor( ColorDefinition newColor )
	{
		if ( newColor != color )
		{
			NotificationChain msgs = null;
			if ( color != null )
				msgs = ( (InternalEObject) color ).eInverseRemove( this,
						EOPPOSITE_FEATURE_BASE - AttributePackage.STYLE__COLOR,
						null,
						msgs );
			if ( newColor != null )
				msgs = ( (InternalEObject) newColor ).eInverseAdd( this,
						EOPPOSITE_FEATURE_BASE - AttributePackage.STYLE__COLOR,
						null,
						msgs );
			msgs = basicSetColor( newColor, msgs );
			if ( msgs != null )
				msgs.dispatch( );
		}
		else if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__COLOR,
					newColor,
					newColor ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ColorDefinition getBackgroundColor( )
	{
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundColor(
			ColorDefinition newBackgroundColor, NotificationChain msgs )
	{
		ColorDefinition oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if ( eNotificationRequired( ) )
		{
			ENotificationImpl notification = new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__BACKGROUND_COLOR,
					oldBackgroundColor,
					newBackgroundColor );
			if ( msgs == null )
				msgs = notification;
			else
				msgs.add( notification );
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor( ColorDefinition newBackgroundColor )
	{
		if ( newBackgroundColor != backgroundColor )
		{
			NotificationChain msgs = null;
			if ( backgroundColor != null )
				msgs = ( (InternalEObject) backgroundColor ).eInverseRemove( this,
						EOPPOSITE_FEATURE_BASE
								- AttributePackage.STYLE__BACKGROUND_COLOR,
						null,
						msgs );
			if ( newBackgroundColor != null )
				msgs = ( (InternalEObject) newBackgroundColor ).eInverseAdd( this,
						EOPPOSITE_FEATURE_BASE
								- AttributePackage.STYLE__BACKGROUND_COLOR,
						null,
						msgs );
			msgs = basicSetBackgroundColor( newBackgroundColor, msgs );
			if ( msgs != null )
				msgs.dispatch( );
		}
		else if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__BACKGROUND_COLOR,
					newBackgroundColor,
					newBackgroundColor ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Image getBackgroundImage( )
	{
		return backgroundImage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackgroundImage( Image newBackgroundImage,
			NotificationChain msgs )
	{
		Image oldBackgroundImage = backgroundImage;
		backgroundImage = newBackgroundImage;
		if ( eNotificationRequired( ) )
		{
			ENotificationImpl notification = new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__BACKGROUND_IMAGE,
					oldBackgroundImage,
					newBackgroundImage );
			if ( msgs == null )
				msgs = notification;
			else
				msgs.add( notification );
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundImage( Image newBackgroundImage )
	{
		if ( newBackgroundImage != backgroundImage )
		{
			NotificationChain msgs = null;
			if ( backgroundImage != null )
				msgs = ( (InternalEObject) backgroundImage ).eInverseRemove( this,
						EOPPOSITE_FEATURE_BASE
								- AttributePackage.STYLE__BACKGROUND_IMAGE,
						null,
						msgs );
			if ( newBackgroundImage != null )
				msgs = ( (InternalEObject) newBackgroundImage ).eInverseAdd( this,
						EOPPOSITE_FEATURE_BASE
								- AttributePackage.STYLE__BACKGROUND_IMAGE,
						null,
						msgs );
			msgs = basicSetBackgroundImage( newBackgroundImage, msgs );
			if ( msgs != null )
				msgs.dispatch( );
		}
		else if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__BACKGROUND_IMAGE,
					newBackgroundImage,
					newBackgroundImage ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Insets getPadding( )
	{
		return padding;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPadding( Insets newPadding,
			NotificationChain msgs )
	{
		Insets oldPadding = padding;
		padding = newPadding;
		if ( eNotificationRequired( ) )
		{
			ENotificationImpl notification = new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__PADDING,
					oldPadding,
					newPadding );
			if ( msgs == null )
				msgs = notification;
			else
				msgs.add( notification );
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding( Insets newPadding )
	{
		if ( newPadding != padding )
		{
			NotificationChain msgs = null;
			if ( padding != null )
				msgs = ( (InternalEObject) padding ).eInverseRemove( this,
						EOPPOSITE_FEATURE_BASE
								- AttributePackage.STYLE__PADDING,
						null,
						msgs );
			if ( newPadding != null )
				msgs = ( (InternalEObject) newPadding ).eInverseAdd( this,
						EOPPOSITE_FEATURE_BASE
								- AttributePackage.STYLE__PADDING,
						null,
						msgs );
			msgs = basicSetPadding( newPadding, msgs );
			if ( msgs != null )
				msgs.dispatch( );
		}
		else if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.STYLE__PADDING,
					newPadding,
					newPadding ) );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove( InternalEObject otherEnd,
			int featureID, Class baseClass, NotificationChain msgs )
	{
		if ( featureID >= 0 )
		{
			switch ( eDerivedStructuralFeatureID( featureID, baseClass ) )
			{
				case AttributePackage.STYLE__FONT :
					return basicSetFont( null, msgs );
				case AttributePackage.STYLE__COLOR :
					return basicSetColor( null, msgs );
				case AttributePackage.STYLE__BACKGROUND_COLOR :
					return basicSetBackgroundColor( null, msgs );
				case AttributePackage.STYLE__BACKGROUND_IMAGE :
					return basicSetBackgroundImage( null, msgs );
				case AttributePackage.STYLE__PADDING :
					return basicSetPadding( null, msgs );
				default :
					return eDynamicInverseRemove( otherEnd,
							featureID,
							baseClass,
							msgs );
			}
		}
		return eBasicSetContainer( null, featureID, msgs );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet( EStructuralFeature eFeature, boolean resolve )
	{
		switch ( eDerivedStructuralFeatureID( eFeature ) )
		{
			case AttributePackage.STYLE__FONT :
				return getFont( );
			case AttributePackage.STYLE__COLOR :
				return getColor( );
			case AttributePackage.STYLE__BACKGROUND_COLOR :
				return getBackgroundColor( );
			case AttributePackage.STYLE__BACKGROUND_IMAGE :
				return getBackgroundImage( );
			case AttributePackage.STYLE__PADDING :
				return getPadding( );
		}
		return eDynamicGet( eFeature, resolve );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet( EStructuralFeature eFeature, Object newValue )
	{
		switch ( eDerivedStructuralFeatureID( eFeature ) )
		{
			case AttributePackage.STYLE__FONT :
				setFont( (FontDefinition) newValue );
				return;
			case AttributePackage.STYLE__COLOR :
				setColor( (ColorDefinition) newValue );
				return;
			case AttributePackage.STYLE__BACKGROUND_COLOR :
				setBackgroundColor( (ColorDefinition) newValue );
				return;
			case AttributePackage.STYLE__BACKGROUND_IMAGE :
				setBackgroundImage( (Image) newValue );
				return;
			case AttributePackage.STYLE__PADDING :
				setPadding( (Insets) newValue );
				return;
		}
		eDynamicSet( eFeature, newValue );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset( EStructuralFeature eFeature )
	{
		switch ( eDerivedStructuralFeatureID( eFeature ) )
		{
			case AttributePackage.STYLE__FONT :
				setFont( (FontDefinition) null );
				return;
			case AttributePackage.STYLE__COLOR :
				setColor( (ColorDefinition) null );
				return;
			case AttributePackage.STYLE__BACKGROUND_COLOR :
				setBackgroundColor( (ColorDefinition) null );
				return;
			case AttributePackage.STYLE__BACKGROUND_IMAGE :
				setBackgroundImage( (Image) null );
				return;
			case AttributePackage.STYLE__PADDING :
				setPadding( (Insets) null );
				return;
		}
		eDynamicUnset( eFeature );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet( EStructuralFeature eFeature )
	{
		switch ( eDerivedStructuralFeatureID( eFeature ) )
		{
			case AttributePackage.STYLE__FONT :
				return font != null;
			case AttributePackage.STYLE__COLOR :
				return color != null;
			case AttributePackage.STYLE__BACKGROUND_COLOR :
				return backgroundColor != null;
			case AttributePackage.STYLE__BACKGROUND_IMAGE :
				return backgroundImage != null;
			case AttributePackage.STYLE__PADDING :
				return padding != null;
		}
		return eDynamicIsSet( eFeature );
	}

	/**
	 * @param font
	 * @param color
	 * @param backcolor
	 * @param backimage
	 * @param padding
	 * @return
	 */
	public static Style create( FontDefinition font, ColorDefinition color,
			ColorDefinition backcolor, Image backimage, Insets padding )
	{
		Style ss = AttributeFactory.eINSTANCE.createStyle( );
		ss.setFont( font );
		ss.setColor( color );
		ss.setBackgroundColor( backcolor );
		ss.setBackgroundImage( backimage );
		ss.setPadding( padding );
		return ss;
	}

} // StyleImpl
